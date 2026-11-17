package ub;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zynmafqrjb implements wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Set f113180eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Set f113181gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f113182iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final wkgbmnqykc f113183lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f113184ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Set f113185wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f113186zoijcleaow;

    private static class iobyxmoadg implements qc.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Set f113187iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final qc.ppxfxbqfkf f113188zoijcleaow;

        public iobyxmoadg(Set set, qc.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f113187iobyxmoadg = set;
            this.f113188zoijcleaow = ppxfxbqfkfVar;
        }
    }

    zynmafqrjb(ppxfxbqfkf ppxfxbqfkfVar, wkgbmnqykc wkgbmnqykcVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (vdvldrhtss vdvldrhtssVar : ppxfxbqfkfVar.lqeggnwhkg()) {
            if (vdvldrhtssVar.eablkybsjg()) {
                if (vdvldrhtssVar.lqeggnwhkg()) {
                    hashSet4.add(vdvldrhtssVar.ppxfxbqfkf());
                } else {
                    hashSet.add(vdvldrhtssVar.ppxfxbqfkf());
                }
            } else if (vdvldrhtssVar.wkgbmnqykc()) {
                hashSet3.add(vdvldrhtssVar.ppxfxbqfkf());
            } else if (vdvldrhtssVar.lqeggnwhkg()) {
                hashSet5.add(vdvldrhtssVar.ppxfxbqfkf());
            } else {
                hashSet2.add(vdvldrhtssVar.ppxfxbqfkf());
            }
        }
        if (!ppxfxbqfkfVar.gtknphoqwx().isEmpty()) {
            hashSet.add(pmvmpeiblj.zoijcleaow(qc.ppxfxbqfkf.class));
        }
        this.f113182iobyxmoadg = Collections.unmodifiableSet(hashSet);
        this.f113186zoijcleaow = Collections.unmodifiableSet(hashSet2);
        this.f113184ppxfxbqfkf = Collections.unmodifiableSet(hashSet3);
        this.f113185wkgbmnqykc = Collections.unmodifiableSet(hashSet4);
        this.f113180eablkybsjg = Collections.unmodifiableSet(hashSet5);
        this.f113181gxszxtbevo = ppxfxbqfkfVar.gtknphoqwx();
        this.f113183lqeggnwhkg = wkgbmnqykcVar;
    }

    @Override // ub.wkgbmnqykc
    public tc.iobyxmoadg dxjokdxxww(Class cls) {
        return eablkybsjg(pmvmpeiblj.zoijcleaow(cls));
    }

    @Override // ub.wkgbmnqykc
    public tc.iobyxmoadg eablkybsjg(pmvmpeiblj pmvmpeibljVar) {
        if (this.f113184ppxfxbqfkf.contains(pmvmpeibljVar)) {
            return this.f113183lqeggnwhkg.eablkybsjg(pmvmpeibljVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", pmvmpeibljVar));
    }

    @Override // ub.wkgbmnqykc
    public tc.zoijcleaow gxszxtbevo(Class cls) {
        return lqeggnwhkg(pmvmpeiblj.zoijcleaow(cls));
    }

    @Override // ub.wkgbmnqykc
    public Object iobyxmoadg(Class cls) {
        if (!this.f113182iobyxmoadg.contains(pmvmpeiblj.zoijcleaow(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objIobyxmoadg = this.f113183lqeggnwhkg.iobyxmoadg(cls);
        return !cls.equals(qc.ppxfxbqfkf.class) ? objIobyxmoadg : new iobyxmoadg(this.f113181gxszxtbevo, (qc.ppxfxbqfkf) objIobyxmoadg);
    }

    @Override // ub.wkgbmnqykc
    public tc.zoijcleaow lqeggnwhkg(pmvmpeiblj pmvmpeibljVar) {
        if (this.f113186zoijcleaow.contains(pmvmpeibljVar)) {
            return this.f113183lqeggnwhkg.lqeggnwhkg(pmvmpeibljVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", pmvmpeibljVar));
    }

    @Override // ub.wkgbmnqykc
    public Set nufgyqmvbu(pmvmpeiblj pmvmpeibljVar) {
        if (this.f113185wkgbmnqykc.contains(pmvmpeibljVar)) {
            return this.f113183lqeggnwhkg.nufgyqmvbu(pmvmpeibljVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", pmvmpeibljVar));
    }

    @Override // ub.wkgbmnqykc
    public tc.zoijcleaow ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        if (this.f113180eablkybsjg.contains(pmvmpeibljVar)) {
            return this.f113183lqeggnwhkg.ppxfxbqfkf(pmvmpeibljVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", pmvmpeibljVar));
    }

    @Override // ub.wkgbmnqykc
    public Object zoijcleaow(pmvmpeiblj pmvmpeibljVar) {
        if (this.f113182iobyxmoadg.contains(pmvmpeibljVar)) {
            return this.f113183lqeggnwhkg.zoijcleaow(pmvmpeibljVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", pmvmpeibljVar));
    }
}
