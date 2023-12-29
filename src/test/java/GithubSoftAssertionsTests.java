import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubSoftAssertionsTests extends TestBase {
    @Test
    void findJUnit5ExampleSoftAssertionsGithubPage() {

        // открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        // перейти в раздел Wiki проекта
        $("#wiki-tab").click();

        // убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-body").shouldHave(text("Soft assertions")).shouldBe(visible);

        // открыть страницу SoftAssertions
        $(byText("Soft assertions")).click();

        // проверить, что внутри есть пример кода для JUnit5 - найти заголовок с текстом
        $$("h4").shouldHave(CollectionCondition.itemWithText("3. Using JUnit5 extend test class:"));

    }

}
