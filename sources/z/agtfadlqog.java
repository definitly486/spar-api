package z;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f126955iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final igdgnonuha f126956ppxfxbqfkf = new igdgnonuha(ojitshcjhn.f127114iobyxmoadg);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private androidx.collection.hcddaimhww f126957zoijcleaow;

    public agtfadlqog(boolean z13) {
        this.f126955iobyxmoadg = z13;
    }

    private final androidx.collection.hcddaimhww gxszxtbevo() {
        if (this.f126957zoijcleaow == null) {
            this.f126957zoijcleaow = androidx.collection.tzroggbefp.zoijcleaow();
        }
        androidx.collection.hcddaimhww hcddaimhwwVar = this.f126957zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(hcddaimhwwVar);
        return hcddaimhwwVar;
    }

    public final boolean eablkybsjg(pkzmftpjix pkzmftpjixVar) {
        if (!pkzmftpjixVar.gxszxtbevo()) {
            w.iobyxmoadg.zoijcleaow("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f126956ppxfxbqfkf.remove(pkzmftpjixVar);
        if (this.f126955iobyxmoadg) {
            androidx.collection.hcddaimhww hcddaimhwwVarGxszxtbevo = gxszxtbevo();
            if (hcddaimhwwVarGxszxtbevo.iobyxmoadg(pkzmftpjixVar)) {
                int iPpxfxbqfkf = hcddaimhwwVarGxszxtbevo.ppxfxbqfkf(pkzmftpjixVar);
                hcddaimhwwVarGxszxtbevo.oxmwwwfdhm(pkzmftpjixVar);
                if (!(iPpxfxbqfkf == (zRemove ? pkzmftpjixVar.tzroggbefp() : Integer.MAX_VALUE))) {
                    w.iobyxmoadg.zoijcleaow("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public final void iobyxmoadg(pkzmftpjix pkzmftpjixVar) {
        if (!pkzmftpjixVar.gxszxtbevo()) {
            w.iobyxmoadg.zoijcleaow("DepthSortedSet.add called on an unattached node");
        }
        if (this.f126955iobyxmoadg) {
            androidx.collection.hcddaimhww hcddaimhwwVarGxszxtbevo = gxszxtbevo();
            int iEablkybsjg = hcddaimhwwVarGxszxtbevo.eablkybsjg(pkzmftpjixVar, Integer.MAX_VALUE);
            if (iEablkybsjg == Integer.MAX_VALUE) {
                hcddaimhwwVarGxszxtbevo.yggfygwlhe(pkzmftpjixVar, pkzmftpjixVar.tzroggbefp());
            } else {
                if (!(iEablkybsjg == pkzmftpjixVar.tzroggbefp())) {
                    w.iobyxmoadg.zoijcleaow("invalid node depth");
                }
            }
        }
        this.f126956ppxfxbqfkf.add(pkzmftpjixVar);
    }

    public final boolean ppxfxbqfkf() {
        return this.f126956ppxfxbqfkf.isEmpty();
    }

    public String toString() {
        return this.f126956ppxfxbqfkf.toString();
    }

    public final pkzmftpjix wkgbmnqykc() {
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) this.f126956ppxfxbqfkf.first();
        eablkybsjg(pkzmftpjixVar);
        return pkzmftpjixVar;
    }

    public final boolean zoijcleaow(pkzmftpjix pkzmftpjixVar) {
        boolean zContains = this.f126956ppxfxbqfkf.contains(pkzmftpjixVar);
        if (this.f126955iobyxmoadg) {
            if (!(zContains == gxszxtbevo().iobyxmoadg(pkzmftpjixVar))) {
                w.iobyxmoadg.zoijcleaow("inconsistency in TreeSet");
            }
        }
        return zContains;
    }
}
