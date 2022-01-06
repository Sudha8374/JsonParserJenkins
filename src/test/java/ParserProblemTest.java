import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.UnknownHostException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;

//@RunWith(PowerMockRunner.class)
//@PrepareForTest(BufferedReader.class)

class ParserProblemTest {
ParserProblem parse;
@Test
void testsuccess()throws Exception {
	ParserProblem js=new ParserProblem();
	String target="{\"batchcomplete\":\"\",\"warnings\":{\"main\":{\"*\":\"Subscribe to the mediawiki-api-announce mailing list at <https://lists.wikimedia.org/postorius/lists/mediawiki-api-announce.lists.wikimedia.org/> for notice of API deprecations and breaking changes. Use [[Special:ApiFeatureUsage]] to see usage of deprecated features by your application.\"},\"revisions\":{\"*\":\"Because \\\"rvslots\\\" was not specified, a legacy format has been used for the output. This format is deprecated, and in the future the new format will always be used.\"}},\"query\":{\"pages\":{\"1808130\":{\"pageid\":1808130,\"ns\":0,\"title\":\"SMALL\",\"revisions\":[{\"contentformat\":\"text/x-wiki\",\"contentmodel\":\"wikitext\",\"*\":\"{{Infobox programming language\\n| name = Small Machine Algol Like Language\\n| logo = <!-- Filename only -->\\n| logo caption = \\n| screenshot = <!-- Filename only -->\\n| screenshot caption = \\n| paradigms = [[Procedural programming|Procedural]], [[Imperative programming|imperative]], [[Structured programming|structured]], [[Object-oriented programming|object-oriented]]\\n| family = [[ALGOL]]\\n| designer = Nevil Brownlee\\n| developer = [[University of Auckland]]\\n| released = {{Start date and age|1980}}<!-- If known, add |mm|dd|df=yes -->\\n| latest release version = Final\\n| latest release date = {{Start date and age|1985}}<!-- If known, add |mm|dd|df=yes -->\\n| typing = \\n| scope = \\n| programming language = [[Fortran]] IV, SMALL\\n| discontinued = Yes\\n| platform = [[Mainframe computer|Mainframe]]s: [[Burroughs Corporation|Burroughs]] B6700, [[Digital Equipment Corporation|DEC]] [[PDP-10]]\\n| operating system = [[TOPS-10]], VM/[[Conversational Monitor System|CMS]]\\n| license = \\n| file ext = \\n| file format = <!-- or: | file formats = -->\\n| website = <!-- {{URL|www.example.com}} -->\\n| implementations = \\n| dialects = \\n| influenced by = [[ALGOL]]\\n| influenced = \\n}}\\n'''Small Machine Algol Like Language''' ('''SMALL'''), is a [[computer programming]] [[programming language|language]] developed by Dr. Nevil Brownlee of the [[University of Auckland]].\\n\\n==History==\\nThe aim of the language was to enable writing [[ALGOL]]-like code that ran on a small machine. It also included the <code>string</code> [[data type]] for easier text manipulation.\\n\\nSMALL was used extensively from about 1980 to 1985 at Auckland University as a programming teaching aid, and for some internal projects. Originally, it was written in [[Fortran]] IV, to run on a [[Burroughs Corporation]] B6700 [[mainframe computer]]. Subsequently, it was rewritten in SMALL, and ported to a [[Digital Equipment Corporation]] (DEC) [[PDP-10]] mainframe (on the [[operating system]] [[TOPS-10]]) and an IBM S360 mainframe (on the operating system VM [[Conversational Monitor System]] (VM/CMS)).\\n\\nAbout 1985, SMALL had some [[object-oriented programming]] features added to handle structures (that were missing from the early language), and to formalise file manipulation operations.\\n\\n==See also==\\n*[[Lua (programming language)]]\\n*[[Squirrel (programming language)]]\\n\\n==References==\\n{{Reflist}}\\n\\n==External links==\\n*[https://www.caida.org/home/staff/nevil/ Nevil Brownlee staff page, Center for Applied Internet Data Analysis]\\n*[https://www.caida.org/~nevil/ Nevil Brownlee personal page, Center for Applied Internet Data Analysis]\\n\\n{{ALGOL programming}}\\n\\n[[Category:Algol programming language family]]\\n[[Category:Systems programming languages]]\\n[[Category:Procedural programming languages]]\\n[[Category:Object-oriented programming languages]]\\n[[Category:Programming languages created in 1980]]\"}]}}}}";
	assertEquals(target,js.par());
}
@Test
void testfail()throws Exception {
	ParserProblem js=new ParserProblem();
	String target="(({\"batchcomplete\":\"\",\"warnings\":{\"main\":{\"*\":\"Subscribe to the mediawiki-api-announce mailing list at <https://lists.wikimedia.org/postorius/lists/mediawiki-api-announce.lists.wikimedia.org/> for notice of API deprecations and breaking changes. Use [[Special:ApiFeatureUsage]] to see usage of deprecated features by your application.\"},\"revisions\":{\"*\":\"Because \\\"rvslots\\\" was not specified, a legacy format has been used for the output. This format is deprecated, and in the future the new format will always be used.\"}},\"query\":{\"pages\":{\"1808130\":{\"pageid\":1808130,\"ns\":0,\"title\":\"SMALL\",\"revisions\":[{\"contentformat\":\"text/x-wiki\",\"contentmodel\":\"wikitext\",\"*\":\"{{Infobox programming language\\n| name = Small Machine Algol Like Language\\n| logo = <!-- Filename only -->\\n| logo caption = \\n| screenshot = <!-- Filename only -->\\n| screenshot caption = \\n| paradigms = [[Procedural programming|Procedural]], [[Imperative programming|imperative]], [[Structured programming|structured]], [[Object-oriented programming|object-oriented]]\\n| family = [[ALGOL]]\\n| designer = Nevil Brownlee\\n| developer = [[University of Auckland]]\\n| released = {{Start date and age|1980}}<!-- If known, add |mm|dd|df=yes -->\\n| latest release version = Final\\n| latest release date = {{Start date and age|1985}}<!-- If known, add |mm|dd|df=yes -->\\n| typing = \\n| scope = \\n| programming language = [[Fortran]] IV, SMALL\\n| discontinued = Yes\\n| platform = [[Mainframe computer|Mainframe]]s: [[Burroughs Corporation|Burroughs]] B6700, [[Digital Equipment Corporation|DEC]] [[PDP-10]]\\n| operating system = [[TOPS-10]], VM/[[Conversational Monitor System|CMS]]\\n| license = \\n| file ext = \\n| file format = <!-- or: | file formats = -->\\n| website = <!-- {{URL|www.example.com}} -->\\n| implementations = \\n| dialects = \\n| influenced by = [[ALGOL]]\\n| influenced = \\n}}\\n'''Small Machine Algol Like Language''' ('''SMALL'''), is a [[computer programming]] [[programming language|language]] developed by Dr. Nevil Brownlee of the [[University of Auckland]].\\n\\n==History==\\nThe aim of the language was to enable writing [[ALGOL]]-like code that ran on a small machine. It also included the <code>string</code> [[data type]] for easier text manipulation.\\n\\nSMALL was used extensively from about 1980 to 1985 at Auckland University as a programming teaching aid, and for some internal projects. Originally, it was written in [[Fortran]] IV, to run on a [[Burroughs Corporation]] B6700 [[mainframe computer]]. Subsequently, it was rewritten in SMALL, and ported to a [[Digital Equipment Corporation]] (DEC) [[PDP-10]] mainframe (on the [[operating system]] [[TOPS-10]]) and an IBM S360 mainframe (on the operating system VM [[Conversational Monitor System]] (VM/CMS)).\\n\\nAbout 1985, SMALL had some [[object-oriented programming]] features added to handle structures (that were missing from the early language), and to formalise file manipulation operations.\\n\\n==See also==\\n*[[Lua (programming language)]]\\n*[[Squirrel (programming language)]]\\n\\n==References==\\n{{Reflist}}\\n\\n==External links==\\n*[https://www.caida.org/home/staff/nevil/ Nevil Brownlee staff page, Center for Applied Internet Data Analysis]\\n*[https://www.caida.org/~nevil/ Nevil Brownlee personal page, Center for Applied Internet Data Analysis]\\n\\n{{ALGOL programming}}\\n\\n[[Category:Algol programming language family]]\\n[[Category:Systems programming languages]]\\n[[Category:Procedural programming languages]]\\n[[Category:Object-oriented programming languages]]\\n[[Category:Programming languages created in 1980]]\"}]}}}}";
	assertNotEquals(target,js.par());
}

	
	

}
