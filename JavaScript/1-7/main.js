class Taiyaki {

    //コンストラクタ
    constructor(ingredient) {
        this.ingredient = ingredient
    }

    TaiyakiIngredient(){
        console.log(`中身は${this.ingredient}です`);
    }
}

let anco = new Taiyaki('あんこ');
anco.TaiyakiIngredient();

let cream = new Taiyaki('クリーム');
cream.TaiyakiIngredient();

let cheese = new Taiyaki('チーズ');
cheese.TaiyakiIngredient();