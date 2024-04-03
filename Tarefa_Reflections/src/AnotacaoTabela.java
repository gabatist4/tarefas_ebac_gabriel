import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface AnotacaoTabela {
    String value();

    String[] apartamento();

    int numeroBloco();
}

