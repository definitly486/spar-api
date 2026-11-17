package wypolnanlu;

import cdpycssgdh.vdvldrhtss;
import istkbnxepw.jpowsppfya;
import istkbnxepw.jyumaefscl;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class ojitshcjhn extends jpowsppfya {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f120777ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120778zoijcleaow;

    ojitshcjhn(jyumaefscl jyumaefsclVar) {
        super(jyumaefsclVar);
        this.f120778zoijcleaow = "virtual-" + jyumaefsclVar.zoijcleaow() + "-" + UUID.randomUUID().toString();
    }

    @Override // istkbnxepw.jpowsppfya, lereixgezr.agtfadlqog
    public int agtfadlqog(int i13) {
        return vdvldrhtss.yggfygwlhe(super.agtfadlqog(i13) - this.f120777ppxfxbqfkf);
    }

    @Override // istkbnxepw.jpowsppfya, lereixgezr.agtfadlqog
    public int iobyxmoadg() {
        return agtfadlqog(0);
    }

    void rgvfuqvkyq(int i13) {
        this.f120777ppxfxbqfkf = i13;
    }

    @Override // istkbnxepw.jpowsppfya, istkbnxepw.jyumaefscl
    public String zoijcleaow() {
        return this.f120778zoijcleaow;
    }
}
