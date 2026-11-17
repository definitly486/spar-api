package pl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static String[] iobyxmoadg(String str) {
        String[] strArrSplit = str.split("\\.");
        if (!str.endsWith(".")) {
            return strArrSplit;
        }
        String[] strArr = new String[strArrSplit.length + 1];
        System.arraycopy(strArrSplit, 0, strArr, 0, strArrSplit.length);
        strArr[strArrSplit.length] = "";
        return strArr;
    }

    public static String zoijcleaow(String... strArr) {
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < strArr.length; i13++) {
            String str = strArr[i13];
            if (str == null) {
                str = "";
            }
            sb3.append(str);
            if (i13 != strArr.length - 1) {
                sb3.append(".");
            }
        }
        return sb3.toString();
    }
}
