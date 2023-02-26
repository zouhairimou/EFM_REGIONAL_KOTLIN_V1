class Ent(private var motAnglais: String, private var motFrancais: String) {

    init {
        require(!motAnglais.isEmptyOrBlank() && !motFrancais.isEmptyOrBlank()) { "Both words must not be empty or blank" }
    }
    fun String?.isEmptyOrBlank(): Boolean {
        return this == null || this.isEmpty() || this.isBlank()
    }
    fun getMotAnglais(): String {
        return motAnglais
    }

    fun setMotAnglais(motAnglais: String) {
        require(!motAnglais.isEmptyOrBlank()) { "The English word must not be empty or blank" }
        this.motAnglais = motAnglais
    }

    fun getMotFrancais(): String {
        return motFrancais
    }

    fun setMotFrancais(motFrancais: String) {
        require(!motFrancais.isEmptyOrBlank()) { "The French word must not be empty or blank" }
        this.motFrancais = motFrancais
    }

    override fun toString(): String {
        return "$motAnglais:$motFrancais"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this.javaClass != other.javaClass) return false
        other as Ent
        return motAnglais == other.motAnglais
    }
}