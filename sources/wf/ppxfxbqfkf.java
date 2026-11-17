package wf;

import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.hkdspvbjdz;
import androidx.lifecycle.ntlheqmsrt;
import java.io.Closeable;
import java.util.Map;
import tg.draadjrbmk;
import vf.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements crxdokpmqz.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final t2.iobyxmoadg.ppxfxbqfkf f119479eablkybsjg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final crxdokpmqz.ppxfxbqfkf f119480ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final crxdokpmqz.ppxfxbqfkf f119481wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f119482zoijcleaow;

    class iobyxmoadg implements t2.iobyxmoadg.ppxfxbqfkf {
        iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: wf.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public interface InterfaceC2981ppxfxbqfkf {
        Map iobyxmoadg();

        Map zoijcleaow();
    }

    class zoijcleaow implements crxdokpmqz.ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f119484zoijcleaow;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            this.f119484zoijcleaow = gxszxtbevoVar;
        }

        private ntlheqmsrt iobyxmoadg(sf.gxszxtbevo gxszxtbevoVar, Class cls, t2.iobyxmoadg iobyxmoadgVar) {
            fg.iobyxmoadg iobyxmoadgVar2 = (fg.iobyxmoadg) ((InterfaceC2981ppxfxbqfkf) qf.iobyxmoadg.iobyxmoadg(gxszxtbevoVar, InterfaceC2981ppxfxbqfkf.class)).iobyxmoadg().get(cls);
            draadjrbmk draadjrbmkVar = (draadjrbmk) iobyxmoadgVar.iobyxmoadg(ppxfxbqfkf.f119479eablkybsjg);
            Object obj = ((InterfaceC2981ppxfxbqfkf) qf.iobyxmoadg.iobyxmoadg(gxszxtbevoVar, InterfaceC2981ppxfxbqfkf.class)).zoijcleaow().get(cls);
            if (obj == null) {
                if (draadjrbmkVar != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (iobyxmoadgVar2 != null) {
                    return (ntlheqmsrt) iobyxmoadgVar2.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (iobyxmoadgVar2 != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (draadjrbmkVar != null) {
                return (ntlheqmsrt) draadjrbmkVar.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class cls, t2.iobyxmoadg iobyxmoadgVar) {
            final eablkybsjg eablkybsjgVar = new eablkybsjg();
            ntlheqmsrt ntlheqmsrtVarIobyxmoadg = iobyxmoadg(this.f119484zoijcleaow.iobyxmoadg(hkdspvbjdz.zoijcleaow(iobyxmoadgVar)).zoijcleaow(eablkybsjgVar).build(), cls, iobyxmoadgVar);
            ntlheqmsrtVarIobyxmoadg.addCloseable(new Closeable() { // from class: wf.wkgbmnqykc
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eablkybsjgVar.iobyxmoadg();
                }
            });
            return ntlheqmsrtVarIobyxmoadg;
        }
    }

    public ppxfxbqfkf(Map map, crxdokpmqz.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        this.f119482zoijcleaow = map;
        this.f119480ppxfxbqfkf = ppxfxbqfkfVar;
        this.f119481wkgbmnqykc = new zoijcleaow(gxszxtbevoVar);
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(Class cls, t2.iobyxmoadg iobyxmoadgVar) {
        return this.f119482zoijcleaow.containsKey(cls) ? this.f119481wkgbmnqykc.create(cls, iobyxmoadgVar) : this.f119480ppxfxbqfkf.create(cls, iobyxmoadgVar);
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(Class cls) {
        if (this.f119482zoijcleaow.containsKey(cls)) {
            return this.f119481wkgbmnqykc.create(cls);
        }
        return this.f119480ppxfxbqfkf.create(cls);
    }
}
