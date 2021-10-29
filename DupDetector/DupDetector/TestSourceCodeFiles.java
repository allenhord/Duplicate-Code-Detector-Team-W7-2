package DupDetector;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSourceCodeFiles{
	
	@Test
	public void testAddFilePaths() {
		SourceCodeFiles m = new SourceCodeFiles();
		//assertThat(m.fileSetToString(), not(contains("/file.cpp")));
		//assertThat(m.printFilePaths(), not(containsString("/file.cpp")));
		m.addFilePaths("/file1.cpp");
		m.printFilePaths();
		m.addFilePaths("something/file2.cpp");
		m.printFilePaths();
		System.out.println(m.fileSetToString());
		//assertThat(m.toString(), contains("/file1.cpp"));
		//assertThat(m.printFilePaths(), containsString("/file1.cpp"));
		//System.out.println(m.getFilePathArray());
		//m.printFilePathsArray();
		//System.out.println(Arrays.toString(filePathArray));
		assertTrue(m.getNumCFiles() == 2);
		System.out.println(m.getNumCFiles());
		
		
		
		
	}
	
	
}