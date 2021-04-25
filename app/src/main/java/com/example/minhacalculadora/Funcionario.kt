
data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String)
{
    override fun toString(): String =
            """
                ____________________
                Nome: $nome
                Salário: $salario
                Tipo de Contratação: $tipoContratacao
                ____________________
            """.trimIndent()

}