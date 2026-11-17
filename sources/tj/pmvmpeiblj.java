package tj;

import sj.lmojexxdyd;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
final class pmvmpeiblj extends lmojexxdyd implements wypolnanlu {
    public pmvmpeiblj(int i13) {
        super(1, Integer.MAX_VALUE, rj.iobyxmoadg.DROP_OLDEST);
        iobyxmoadg(Integer.valueOf(i13));
    }

    @Override // sj.wypolnanlu
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) hcddaimhww()).intValue());
        }
        return numValueOf;
    }

    public final boolean jlmebxxoox(int i13) {
        boolean zIobyxmoadg;
        synchronized (this) {
            zIobyxmoadg = iobyxmoadg(Integer.valueOf(((Number) hcddaimhww()).intValue() + i13));
        }
        return zIobyxmoadg;
    }
}
