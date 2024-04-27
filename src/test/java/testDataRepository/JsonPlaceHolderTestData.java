package testDataRepository;

import org.json.JSONObject;

public class JsonPlaceHolderTestData {
    public int successStatusCode = 200;

    public JSONObject createExpectedData() {
        JSONObject body = new JSONObject();
        body.put("userId", 3);
        body.put("id", 21);
        body.put("title", "asperiores ea ipsam voluptatibus modi minima quia sint");
        body.put("body", "repellat aliquid praesentium dolorem quo\n" +
                "sed totam minus non itaque\n" +
                "nihil labore molestiae sunt dolor eveniet hic recusandae veniam\n" +
                "tempora et tenetur expedita sunt");
        return body;
    }
}
