package jl002_simpleprojects;

public class JL003_Strings {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed quis " +
                "libero sit amet felis fermentum hendrerit. Ut vulputate sollicitudin enim, " +
                "sit amet tempor ipsum cursus non. Sed ultricies pharetra tellus, ac fringilla " +
                "odio tempor id. Fusce mattis lacus nec enim ullamcorper, ac ultricies erat efficitur. " +
                "Phasellus hendrerit lorem vel justo consectetur, ac tincidunt ex consequat. " +
                "Integer non libero vitae lectus eleifend suscipit. Suspendisse potenti. " +
                "Nullam lobortis velit sit amet felis tristique eleifend. Proin ullamcorper turpis eu " +
                "nulla consequat, vitae dapibus risus aliquet. Cras interdum scelerisque lectus, non " +
                "cursus felis dapibus at. Duis volutpat felis nec felis vehicula, vel vestibulum justo " +
                "suscipit. Integer vel efficitur urna, in efficitur enim. Nam finibus ex id consectetur " +
                "fermentum. Nullam vitae urna id nisi consectetur auctor nec nec dui. Donec quis tristique risus.\n" +
                "\n" +
                "Suspendisse blandit eleifend mi a suscipit. Fusce non felis ac nisi rutrum lacinia. " +
                "Phasellus euismod purus id ipsum commodo ultricies. Nam id dui euismod, efficitur nulla non, fringilla " +
                "libero. Nulla facilisi. Integer ut feugiat libero. Etiam suscipit ligula a erat interdum, vel dictum " +
                "lorem lobortis. Nulla facilisi. Vivamus auctor nisl in purus suscipit, sed hendrerit nisi vestibulum. " +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. " +
                "Curabitur vehicula ligula vitae nisi mattis aliquam. Duis a aliquam lorem. Quisque convallis " +
                "elit vel ipsum commodo ultricies. Vestibulum ut nulla a sapien fermentum fringilla vitae sit amet " +
                "velit. Aenean vel lorem nec lorem venenatis scelerisque.\n" +
                "\n" +
                "Sed sed nisi vitae enim sollicitudin blandit. Vestibulum ante ipsum primis in " +
                "faucibus orci luctus et ultrices posuere cubilia Curae; Nunc faucibus, ipsum ac lobortis vehicula, " +
                "quam velit pharetra nulla, ac ullamcorper libero orci eu elit. Curabitur tempor rutrum augue, " +
                "vitae congue magna ultricies eu. Sed tincidunt sapien nec nulla viverra, et hendrerit nunc faucibus. " +
                "Morbi tincidunt tincidunt turpis, non suscipit lacus. Phasellus sit amet libero ligula. Vivamus ac " +
                "neque ac turpis consequat suscipit in eu lacus. Nullam venenatis, tortor sit amet blandit laoreet, " +
                "nunc libero convallis turpis, a commodo tortor sem vel metus. Maecenas sed faucibus purus, a " +
                "pellentesque enim. Aliquam eget diam euismod, tincidunt velit eu, consectetur elit. Nulla facilisi.\n" +
                "\n" +
                "Vivamus eget orci ut nulla tempus feugiat. Sed scelerisque libero non dolor convallis, id tempus " +
                "sapien mattis. Phasellus tempus, ligula at consequat euismod, arcu arcu vehicula enim, et tincidunt " +
                "velit nulla vitae est. Aliquam quis magna sapien. Donec non nisi vel magna ultricies ullamcorper. " +
                "Nullam fringilla massa at leo feugiat, et tincidunt lorem fringilla. Vivamus rutrum orci at turpis " +
                "cursus scelerisque. Sed eget tellus dignissim, fermentum libero a, vehicula felis. Duis id dolor leo. " +
                "Maecenas eleifend nibh ut malesuada rhoncus. Integer vel mauris massa. Phasellus lacinia nunc nec " +
                "posuere dictum. Vivamus id mauris suscipit, bibendum felis et, vulputate magna. Aenean pretium ante in " +
                "lectus auctor, nec scelerisque sapien ultrices. Curabitur vestibulum arcu sed sapien bibendum rutrum.\n" +
                "\n" +
                "Integer scelerisque sit amet tortor eget cursus. Phasellus sit amet sollicitudin nibh. Cras id nisi ut " +
                "risus congue vulputate. Pellentesque ut pharetra mi. Donec elementum placerat nibh, at consectetur " +
                "sapien commodo sed. Vivamus eget scelerisque nunc. Aliquam erat volutpat. Integer tincidunt scelerisque " +
                "libero vel fermentum. Duis elementum metus nec leo scelerisque, vitae volutpat justo auctor. Vivamus " +
                "eget nulla eu nulla semper bibendum non vitae enim. Mauris sed tincidunt neque. Aliquam condimentum " +
                "tincidunt lectus, ut pharetra est ultricies vel. Suspendisse ultricies mauris ac magna gravida, in " +
                "lobortis libero ullamcorper. Ut ac dui a elit interdum convallis.\n" +
                "\n" +
                "Donec non massa quam. Sed quis aliquet quam. Donec id lorem sed justo fringilla eleifend ac at lacus. " +
                "In hac habitasse platea dictumst. Fusce nec placerat sapien. Nullam fringilla, sem non commodo malesuada, " +
                "ligula eros ultrices mauris, ac feugiat ipsum mauris non metus. Aenean vehicula ut nulla sit amet dapibus. " +
                "Nam sollicitudin commodo est. Ut ultricies, nunc in lacinia hendrerit, ex metus facilisis purus, " +
                "id ultricies justo nisi ut est. Aenean elementum, lacus sed vestibulum ultricies, arcu libero " +
                "convallis quam, ut consequat urna nulla vitae libero. Cras dignissim suscipit velit. In nec ultricies lacus. " +
                "Nullam ac quam tincidunt, ultricies eros a, vehicula dui. Sed\n";

        String[] paragraphs = text.split("\n\n"); // Split the text into paragraphs based on double line breaks

        for (String paragraph : paragraphs) {
            System.out.println(paragraph); // Print each paragraph
        }
    }
}
