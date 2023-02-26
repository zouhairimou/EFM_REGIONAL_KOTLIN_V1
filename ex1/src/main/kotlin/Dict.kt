class Dict(private val entries: ArrayList<Ent> = ArrayList()) {

    fun nombreEntrees(): Int {
        return entries.size
    }

    fun ajouter(e: Ent) {
        require(!entries.contains(e)) { "The entry already exists in the dictionary" }
        entries.add(e)
    }

    fun supprimer(e: Ent): Boolean {
        return entries.remove(e)
    }

    fun supprimer(motAnglais: String): Boolean {
        val entry = entries.find { it.getMotAnglais() == motAnglais }
        return if (entry != null) {
            entries.remove(entry)
            true
        } else {
            false
        }
    }

    fun frAn(motFrancais: String): ArrayList<String> {
        val motsAnglais = ArrayList<String>()
        entries.forEach {
            if (it.getMotFrancais() == motFrancais) {
                motsAnglais.add(it.getMotAnglais())
            }
        }
        return motsAnglais
    }

    fun motsFrancais(): ArrayList<String> {
        val motsFrancais = HashSet<String>()
        entries.forEach { motsFrancais.add(it.getMotFrancais()) }
        return ArrayList(motsFrancais)
    }

    fun dictionnaireFrAn(): Map<String, ArrayList<String>> {
        val dictionnaire = HashMap<String, ArrayList<String>>()
        entries.forEach {
            val motsAnglais = dictionnaire.getOrDefault(it.getMotFrancais(), ArrayList())
            motsAnglais.add(it.getMotAnglais())
            dictionnaire[it.getMotFrancais()] = motsAnglais
        }
        return dictionnaire
    }

    override fun toString(): String {
        var dictString = ""
        entries.forEach { dictString += it.toString() + "\n" }
        return dictString
    }
}