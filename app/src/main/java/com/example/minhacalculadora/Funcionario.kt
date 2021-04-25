
data class Funcionario (
    val nome: String,
    val salario: Double)
{
    override fun toString(): String =
            """
                Nome: $nome
                Salário: $salario
                
            """.trimIndent()

}