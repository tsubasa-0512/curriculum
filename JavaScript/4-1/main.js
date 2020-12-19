var app = new Vue({
    el: "#app",
    data: {
        list: [],  
        addText: '', 
        keyword: ''
    },
    computed:{
        remainingTask: function(){
            var count = 0;
            var list = this.list;
            for(var i = 0; i < list.length; i++){
                if(!list[i].isChecked) {
                    count++;
                }
            }
            return count;
        },
        fileteredTodo: function(){
            var searchResult = [];
            for(var i in this.list){
                var todo = this.list[i];

                if(todo.text.indexOf(this.keyword) !== -1){
                    searchResult.push(todo);
                }
            }
            return searchResult
        }
    },
    watch: {
        list: {
            handler: function(){
                localStorage.setItem("list", JSON.stringify(this.list));
            },
            deep: true
        }
    },
    mounted: function(){
        this.list = JSON.parse(localStorage.getItem("list")) || [];
    },
    methods: {
        addToDo: function(){
            if(this.addText != ''){
                this.list.push({
                  text: this.addText,
                  isChecked: false,
                });
            }
        this.addText = '';
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                return !todo.isChecked;
            });
        }
    }
});