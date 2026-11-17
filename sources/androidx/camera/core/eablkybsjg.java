package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lereixgezr.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg implements agtfadlqog {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected final agtfadlqog f3685yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f3686zdlpuopuiu = new Object();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Set f3684jyumaefscl = new HashSet();

    public interface iobyxmoadg {
        void zoijcleaow(agtfadlqog agtfadlqogVar);
    }

    protected eablkybsjg(agtfadlqog agtfadlqogVar) {
        this.f3685yggfygwlhe = agtfadlqogVar;
    }

    @Override // androidx.camera.core.agtfadlqog
    public dsvhmnatus K() {
        return this.f3685yggfygwlhe.K();
    }

    @Override // androidx.camera.core.agtfadlqog
    public Image U() {
        return this.f3685yggfygwlhe.U();
    }

    @Override // androidx.camera.core.agtfadlqog, java.lang.AutoCloseable
    public void close() {
        this.f3685yggfygwlhe.close();
        wkgbmnqykc();
    }

    @Override // androidx.camera.core.agtfadlqog
    public agtfadlqog.iobyxmoadg[] eslsurpljm() {
        return this.f3685yggfygwlhe.eslsurpljm();
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getFormat() {
        return this.f3685yggfygwlhe.getFormat();
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getHeight() {
        return this.f3685yggfygwlhe.getHeight();
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getWidth() {
        return this.f3685yggfygwlhe.getWidth();
    }

    public void iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f3686zdlpuopuiu) {
            this.f3684jyumaefscl.add(iobyxmoadgVar);
        }
    }

    @Override // androidx.camera.core.agtfadlqog
    public void oipsdeybqn(Rect rect) {
        this.f3685yggfygwlhe.oipsdeybqn(rect);
    }

    protected void wkgbmnqykc() {
        HashSet hashSet;
        synchronized (this.f3686zdlpuopuiu) {
            hashSet = new HashSet(this.f3684jyumaefscl);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((iobyxmoadg) it.next()).zoijcleaow(this);
        }
    }
}
