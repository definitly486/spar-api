package t6;

import android.util.Base64;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class uwvvkdfqfp implements metgxyhuhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final String f109887iobyxmoadg = iwizpuwonk.iobyxmoadg(new byte[]{116, -28, -10, 89, 47, 28, 72, 78, 102, -24, -20, -66, 68, -113, -92, -92});

    private String zoijcleaow(kc2.nufgyqmvbu nufgyqmvbuVar) {
        BitSet bitSet = new BitSet(8);
        Iterator it = nufgyqmvbuVar.zoijcleaow().iterator();
        while (it.hasNext()) {
            bitSet.set(((kc2.nufgyqmvbu.iobyxmoadg) it.next()).iobyxmoadg());
        }
        return Base64.encodeToString(bitSet.toByteArray(), 2);
    }

    @Override // t6.metgxyhuhe
    public void iobyxmoadg(oc2.iobyxmoadg iobyxmoadgVar, kc2.nufgyqmvbu nufgyqmvbuVar) {
        iobyxmoadgVar.put(f109887iobyxmoadg, zoijcleaow(nufgyqmvbuVar));
    }
}
