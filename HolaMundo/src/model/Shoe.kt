package model

class Shoe(name: String, description: String, sku: Int, var mark: String): Product(name,description,sku), ICrudActions {
    var size: Int = 34
        set(value) {
            if(value >= 34)
                field = value
            else
                field = 34
        }
        get() = field
    var color: String = "White"
    var model: String = "Boots"
        set(value) {
            if(value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }
        get() = field

    override fun toString(): String {
        return super.toString()+"\nMarca: $mark, \nTamaño: $size, \nColor: $color, \nModelo: $model"
    }

    override fun create(): String {
        saludar("Saludos desde Shoe")
        return "Create Shoe"
    }

    override fun read(): String {
        return "Read Shoe"
    }

    override fun update(): String {
        return "Update Shoe"
    }

    override fun delete(): String {
        return "Delete Shoe"
    }

    init {
        println("SKU ID: $sku")
        println("Marca: $mark")
    }
}