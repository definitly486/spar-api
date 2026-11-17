package yl;

import java.io.Reader;
import java.io.StringReader;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class oxmwwwfdhm implements Cloneable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private wwaezpbzkn f125795cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ReentrantLock f125796esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f125797iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private vdvldrhtss f125798jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private rgvfuqvkyq f125799yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final dsvhmnatus f125800zdlpuopuiu;

    public oxmwwwfdhm(dsvhmnatus dsvhmnatusVar) {
        this.f125797iwizpuwonk = false;
        this.f125796esjtqupxsv = new ReentrantLock();
        this.f125800zdlpuopuiu = dsvhmnatusVar;
        this.f125798jyumaefscl = dsvhmnatusVar.gxszxtbevo();
        this.f125799yggfygwlhe = rgvfuqvkyq.draadjrbmk();
    }

    public static oxmwwwfdhm eablkybsjg() {
        return new oxmwwwfdhm(new wflxmlrfwp());
    }

    public static xl.gxszxtbevo nufgyqmvbu(String str, String str2) {
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp();
        return wflxmlrfwpVar.wflxmlrfwp(new StringReader(str), str2, new oxmwwwfdhm(wflxmlrfwpVar));
    }

    public static oxmwwwfdhm ojitshcjhn() {
        return new oxmwwwfdhm(new wypolnanlu());
    }

    public wwaezpbzkn agtfadlqog() {
        if (this.f125795cqumvgiudr == null) {
            this.f125795cqumvgiudr = this.f125800zdlpuopuiu.lqeggnwhkg();
        }
        return this.f125795cqumvgiudr;
    }

    public xl.gxszxtbevo draadjrbmk(String str, String str2) {
        return gtknphoqwx(new StringReader(str), str2);
    }

    public xl.gxszxtbevo gtknphoqwx(Reader reader, String str) {
        try {
            this.f125796esjtqupxsv.lock();
            return this.f125800zdlpuopuiu.wflxmlrfwp(reader, str, this);
        } finally {
            this.f125796esjtqupxsv.unlock();
        }
    }

    public boolean gxszxtbevo() {
        return this.f125799yggfygwlhe.wkgbmnqykc() > 0;
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public oxmwwwfdhm clone() {
        return new oxmwwwfdhm(this);
    }

    public boolean lqeggnwhkg() {
        return this.f125797iwizpuwonk;
    }

    public rgvfuqvkyq ppxfxbqfkf() {
        return this.f125799yggfygwlhe;
    }

    public vdvldrhtss wflxmlrfwp() {
        return this.f125798jyumaefscl;
    }

    public dsvhmnatus wkgbmnqykc() {
        return this.f125800zdlpuopuiu;
    }

    public String zoijcleaow() {
        return wkgbmnqykc().eablkybsjg();
    }

    private oxmwwwfdhm(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f125797iwizpuwonk = false;
        this.f125796esjtqupxsv = new ReentrantLock();
        this.f125800zdlpuopuiu = oxmwwwfdhmVar.f125800zdlpuopuiu.btonecajqb();
        this.f125799yggfygwlhe = new rgvfuqvkyq(oxmwwwfdhmVar.f125799yggfygwlhe);
        this.f125798jyumaefscl = new vdvldrhtss(oxmwwwfdhmVar.f125798jyumaefscl);
        this.f125797iwizpuwonk = oxmwwwfdhmVar.f125797iwizpuwonk;
    }
}
