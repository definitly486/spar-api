package j0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.pmvmpeiblj f50148iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private f f50149ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private wflxmlrfwp f50150zoijcleaow;

    public d(int i13) {
        this.f50148iobyxmoadg = i13 != 1 ? new androidx.collection.pmvmpeiblj(i13) : null;
    }

    public final f iobyxmoadg(e eVar) {
        f fVar;
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(eVar);
        androidx.collection.pmvmpeiblj pmvmpeibljVar = this.f50148iobyxmoadg;
        if (pmvmpeibljVar != null) {
            fVar = (f) pmvmpeibljVar.get(wflxmlrfwpVar);
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50150zoijcleaow, wflxmlrfwpVar)) {
                return null;
            }
            fVar = this.f50149ppxfxbqfkf;
        }
        if (fVar == null || fVar.iwizpuwonk().wflxmlrfwp().ppxfxbqfkf()) {
            return null;
        }
        return fVar;
    }

    public final void zoijcleaow(e eVar, f fVar) {
        androidx.collection.pmvmpeiblj pmvmpeibljVar = this.f50148iobyxmoadg;
        if (pmvmpeibljVar != null) {
            pmvmpeibljVar.put(new wflxmlrfwp(eVar), fVar);
        } else {
            this.f50150zoijcleaow = new wflxmlrfwp(eVar);
            this.f50149ppxfxbqfkf = fVar;
        }
    }
}
