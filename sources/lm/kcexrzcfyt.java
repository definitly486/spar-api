package lm;

import java.util.Objects;
import lk.cdpycssgdh;
import lk.pmvmpeiblj;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt<T> {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cdpycssgdh f63455iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f63456ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f63457zoijcleaow;

    private kcexrzcfyt(cdpycssgdh cdpycssgdhVar, Object obj, yadqdtsiqt yadqdtsiqtVar) {
        this.f63455iobyxmoadg = cdpycssgdhVar;
        this.f63457zoijcleaow = obj;
        this.f63456ppxfxbqfkf = yadqdtsiqtVar;
    }

    public static kcexrzcfyt btonecajqb(Object obj) {
        return gtknphoqwx(obj, new cdpycssgdh.iobyxmoadg().eablkybsjg(200).draadjrbmk("OK").ojitshcjhn(pmvmpeiblj.HTTP_1_1).vdvldrhtss(new zynmafqrjb.iobyxmoadg().kcexrzcfyt("http://localhost/").zoijcleaow()).ppxfxbqfkf());
    }

    public static kcexrzcfyt dxjokdxxww(int i13, Object obj) {
        if (i13 >= 200 && i13 < 300) {
            return gtknphoqwx(obj, new cdpycssgdh.iobyxmoadg().eablkybsjg(i13).draadjrbmk("Response.success()").ojitshcjhn(pmvmpeiblj.HTTP_1_1).vdvldrhtss(new zynmafqrjb.iobyxmoadg().kcexrzcfyt("http://localhost/").zoijcleaow()).ppxfxbqfkf());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i13);
    }

    public static kcexrzcfyt gtknphoqwx(Object obj, cdpycssgdh cdpycssgdhVar) {
        Objects.requireNonNull(cdpycssgdhVar, "rawResponse == null");
        if (cdpycssgdhVar.iwxlajgraz()) {
            return new kcexrzcfyt(cdpycssgdhVar, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static kcexrzcfyt ppxfxbqfkf(int i13, yadqdtsiqt yadqdtsiqtVar) {
        Objects.requireNonNull(yadqdtsiqtVar, "body == null");
        if (i13 >= 400) {
            return wkgbmnqykc(yadqdtsiqtVar, new cdpycssgdh.iobyxmoadg().zoijcleaow(new wflxmlrfwp.ppxfxbqfkf(yadqdtsiqtVar.dxjokdxxww(), yadqdtsiqtVar.nufgyqmvbu())).eablkybsjg(i13).draadjrbmk("Response.error()").ojitshcjhn(pmvmpeiblj.HTTP_1_1).vdvldrhtss(new zynmafqrjb.iobyxmoadg().kcexrzcfyt("http://localhost/").zoijcleaow()).ppxfxbqfkf());
        }
        throw new IllegalArgumentException("code < 400: " + i13);
    }

    public static kcexrzcfyt wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar, cdpycssgdh cdpycssgdhVar) {
        Objects.requireNonNull(yadqdtsiqtVar, "body == null");
        Objects.requireNonNull(cdpycssgdhVar, "rawResponse == null");
        if (cdpycssgdhVar.iwxlajgraz()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new kcexrzcfyt(cdpycssgdhVar, null, yadqdtsiqtVar);
    }

    public yadqdtsiqt eablkybsjg() {
        return this.f63456ppxfxbqfkf;
    }

    public boolean gxszxtbevo() {
        return this.f63455iobyxmoadg.iwxlajgraz();
    }

    public Object iobyxmoadg() {
        return this.f63457zoijcleaow;
    }

    public String lqeggnwhkg() {
        return this.f63455iobyxmoadg.zdlpuopuiu();
    }

    public cdpycssgdh nufgyqmvbu() {
        return this.f63455iobyxmoadg;
    }

    public String toString() {
        return this.f63455iobyxmoadg.toString();
    }

    public int zoijcleaow() {
        return this.f63455iobyxmoadg.btonecajqb();
    }
}
