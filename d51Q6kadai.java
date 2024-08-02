public class d51Q6kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }

        Item[] majorItems = { new Item("AA", "魚類"), new Item("BB", "肉類") };
        Item[] minorItems = { 
            new Item("A1", "さば"), 
            new Item("A2", "さんま"),
            new Item("B1", "鶏肉"), 
            new Item("B2", "牛肉"), 
            new Item("B3", "豚肉") 
        };

        ItemMaster im = new ItemMaster(majorItems, minorItems);

        String productCode = args[0];
        if (productCode.length() < 8) {
            System.out.println("商品コードの形式が不正");
            return;
        }

        String majorCode = productCode.substring(0, 2);
        String minorCode = productCode.substring(2, 4);
        String details = productCode.substring(4);

        String majorName = im.getItemName(im.MAJOR, majorCode);
        String minorName = im.getItemName(im.MINOR, minorCode);

        System.out.println("商品コード：" + productCode);
        System.out.println("大分類名：" + majorName);
        System.out.println("小分類名：" + minorName);
        System.out.println("詳細コード：" + details);
    }
}

class Item {
    private String code;
    private String name;

    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

class ItemMaster {
    public static final int MAJOR = 0;
    public static final int MINOR = 1;
    private Item[][] items;

    ItemMaster(Item[] major, Item[] minor) {
        items = new Item[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length; i++) {
            if (items[codeLevel][i].getCode().equals(code)) {
                return items[codeLevel][i].getName();
            }
        }
        return "不明";
    }
}

