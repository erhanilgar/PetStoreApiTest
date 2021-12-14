package petStore.dataFactory;

public class DataFactory_PetStore {


    public static String testData = "TestUser";

    public static String addNewPetBody(String id, String name) {

        return "{\n" +
                "          \"id\": " + id + ",\n" +
                "          \"category\": {\n" +
                "            \"id\": 0,\n" +
                "            \"name\": \"" + name + "\"\n" +
                "          },\n" +
                "          \"name\": \"doggie\",\n" +
                "          \"photoUrls\": [\n" +
                "            \"string\"\n" +
                "          ],\n" +
                "          \"tags\": [\n" +
                "            {\n" +
                "              \"id\": 0,\n" +
                "              \"name\": \"string\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"status\": \"available\"\n" +
                "        }";
    }

    public static String upDateName(String id, String updateName, String tagName) {

        return "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"" + updateName + "\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"" + tagName + "\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";


    }
}
