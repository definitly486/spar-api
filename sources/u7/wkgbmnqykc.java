package u7;

/* JADX INFO: loaded from: classes2.dex */
abstract class wkgbmnqykc {
    static String iobyxmoadg(int i13, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('$');
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            if (i15 == 1 || i15 == 2) {
                sb3.append('[');
                sb3.append(iArr2[i14]);
                sb3.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb3.append('.');
                String str = strArr[i14];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        return sb3.toString();
    }
}
