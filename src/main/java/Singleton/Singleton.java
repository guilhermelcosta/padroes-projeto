package Singleton;

/**
 * <h2><a href="https://refactoring.guru/design-patterns/singleton">Singleton</a></h1>
 * <ul>
 *     <h3>Vantagens:</h3>
 *     <li>Acesso controlado à instância única.</li>
 *     <li>É fácil permitir um número maior de instâncias caso seja necessário.</li>
 *     <li>Usa o lazy instantiation, ou seja, o Singleton só é criado no momento de utilização.</li>
 *     <li>Substitui variáveis globais.</li>
 * </ul>
 * <ul>
 *     <h3>Desvantagens:</h3>
 *     <li>Difícil de testar.</li>
 *     <li>Viola princípio da responsabilidade única.</li>
 *     <li>Requer tratamentos especiais em casos de concorrência.</li>
 * </ul>
 */
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
    }

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static Singleton getINSTANCE() {
        if (INSTANCE == null)
            INSTANCE = new Singleton();
        return INSTANCE;
    }
}
