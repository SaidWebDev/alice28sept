import com.ibm.decision.run.test.junit5.JSONTestDirectoryFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;

public class TestDecisions {
    @DisplayName("Test all decision functions")
    @TestFactory
    public Stream<DynamicContainer> decisionFunctionTests() {
        return JSONTestDirectoryFactory.createAllFunctionsTests();
    }
}
