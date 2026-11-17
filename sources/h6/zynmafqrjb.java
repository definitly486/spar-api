package h6;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zynmafqrjb implements lereixgezr {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f39676ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lereixgezr f39677zoijcleaow;

    public zynmafqrjb(lereixgezr delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f39677zoijcleaow = delegate;
        this.f39676ppxfxbqfkf = new Object();
    }

    @Override // h6.lereixgezr
    public esjtqupxsv eablkybsjg(p6.wflxmlrfwp id2) {
        esjtqupxsv esjtqupxsvVarEablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        synchronized (this.f39676ppxfxbqfkf) {
            esjtqupxsvVarEablkybsjg = this.f39677zoijcleaow.eablkybsjg(id2);
        }
        return esjtqupxsvVarEablkybsjg;
    }

    @Override // h6.lereixgezr
    public List remove(String workSpecId) {
        List listRemove;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        synchronized (this.f39676ppxfxbqfkf) {
            listRemove = this.f39677zoijcleaow.remove(workSpecId);
        }
        return listRemove;
    }

    @Override // h6.lereixgezr
    public esjtqupxsv wkgbmnqykc(p6.wflxmlrfwp id2) {
        esjtqupxsv esjtqupxsvVarWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        synchronized (this.f39676ppxfxbqfkf) {
            esjtqupxsvVarWkgbmnqykc = this.f39677zoijcleaow.wkgbmnqykc(id2);
        }
        return esjtqupxsvVarWkgbmnqykc;
    }

    @Override // h6.lereixgezr
    public boolean zoijcleaow(p6.wflxmlrfwp id2) {
        boolean zZoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        synchronized (this.f39676ppxfxbqfkf) {
            zZoijcleaow = this.f39677zoijcleaow.zoijcleaow(id2);
        }
        return zZoijcleaow;
    }
}
