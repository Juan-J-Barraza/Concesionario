package Class;

public class Equipment {
   private String name;
   private String type;
   private String features;

   public Equipment() {

   }

   public Equipment(String name, String type, String features) {
      this.name = name;
      this.type = type;
      this.features = features;
   }

   @Override
   public String toString() {
       return "Equipment{" +
               "name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", features='" + features + '\'' +
               '}';
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getFeatures() {
      return features;
   }

   public void setFeatures(String features) {
      this.features = features;
   }

}
