package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class akstest {
    public static void main(String[] args) {
        String s = "Archive: AutomationExportZip20220530133445_00000_UnCompressed.zip" +
                "inflating: 054c21b988273ba40e0000005056a64c760000018111f95d7f00000000.eml" +
                "inflating: 05dab63025d02edb320000005056a64c760000018111f95d9d00000000.eml " +
                "inflating: 054991b0240a7d78910000005056a64c760000018111f98c7700000000.eml " +
                "inflating: 059499d8181c69b22e0000005056a64c760000018111f98c8200000000.eml " +
                "inflating: 055d8246ac11f0a77e0000005056a64c760000018111f98dcf00000000.eml";

        List<String> exportedZipContentList = Arrays.stream(Objects.requireNonNull(s).split("\r?\n"))
                .filter(element -> element.matches("\\s{0,}inflating:\\s{1,}.*")).map(element -> element.replaceAll("^\\s{0,}inflating:\\s{1,}", "").trim())
                .collect(Collectors.toList());
        for(String s1:exportedZipContentList ){
            System.out.println(s1);
        }
    }
}
