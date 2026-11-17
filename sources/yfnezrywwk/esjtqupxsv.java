package yfnezrywwk;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class esjtqupxsv {
    public static final int iobyxmoadg(cqumvgiudr cqumvgiudrVar) {
        List listNufgyqmvbu = cqumvgiudrVar.nufgyqmvbu();
        int size = listNufgyqmvbu.size();
        int size2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            size2 += ((agtfadlqog) listNufgyqmvbu.get(i13)).getSize();
        }
        return (size2 / listNufgyqmvbu.size()) + cqumvgiudrVar.lqeggnwhkg();
    }
}
