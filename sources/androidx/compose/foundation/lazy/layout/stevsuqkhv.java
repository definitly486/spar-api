package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class stevsuqkhv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.iozdgvuglv f5127iobyxmoadg = androidx.collection.rgvfuqvkyq.ppxfxbqfkf();

    public abstract cllcsxoeiz iobyxmoadg(int i13, int i14, int i15, long j13);

    public final List zoijcleaow(jpowsppfya jpowsppfyaVar, int i13, long j13) {
        List list = (List) this.f5127iobyxmoadg.zoijcleaow(i13);
        if (list != null) {
            return list;
        }
        List listN = jpowsppfyaVar.N(i13);
        int size = listN.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(((x.pmvmpeiblj) listN.get(i14)).sflfametgt(j13));
        }
        this.f5127iobyxmoadg.oxmwwwfdhm(i13, arrayList);
        return arrayList;
    }
}
