//import static com.sun.beans.finder.ClassFinder.findClass;
//
//public class TestA {
//    protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
//        // 首先，检查请求的类是否已经被加载过了
//        Class c = findLoadedClass(name);
//        if (c == null) {
//            try {
//                if (parent != null) {
//                    c = parent.loadClass(name, false);
//                } else {
//                    c = findBootstrapClassOrNull(name);
//                }
//            } catch (ClassNotFoundException e) {
//                // 如果父类加载器抛出ClassNotFoundException
//                // 再调用本身的findclass方法来进行类加载
//                c = findClass(name);
//            }
//        }
//        if (resolve) {
//            resolveClass(c);
//        }
//        return c;
//    }
//}