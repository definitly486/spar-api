package n0;

import androidx.compose.runtime.i1;

/* JADX INFO: loaded from: classes.dex */
public final class jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final s0.yggfygwlhe f68270iobyxmoadg = new s0.yggfygwlhe();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.pmvmpeiblj f68271zoijcleaow = new androidx.collection.pmvmpeiblj(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(jhduphickx jhduphickxVar, ribwqtqdhb ribwqtqdhbVar, ikoacuggdj ikoacuggdjVar) {
        synchronized (jhduphickxVar.f68270iobyxmoadg) {
            try {
                if (ikoacuggdjVar.dxjokdxxww()) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final i1 zoijcleaow(final ribwqtqdhb ribwqtqdhbVar, tg.draadjrbmk draadjrbmkVar) {
        synchronized (this.f68270iobyxmoadg) {
            ikoacuggdj ikoacuggdjVar = (ikoacuggdj) this.f68271zoijcleaow.get(ribwqtqdhbVar);
            if (ikoacuggdjVar != null) {
                if (ikoacuggdjVar.dxjokdxxww()) {
                    return ikoacuggdjVar;
                }
            }
            try {
                ikoacuggdj ikoacuggdjVar2 = (ikoacuggdj) draadjrbmkVar.invoke(new tg.draadjrbmk() { // from class: n0.vipkmwdibw
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return jhduphickx.ppxfxbqfkf(this.f68341zdlpuopuiu, ribwqtqdhbVar, (ikoacuggdj) obj);
                    }
                });
                synchronized (this.f68270iobyxmoadg) {
                    try {
                        if (this.f68271zoijcleaow.get(ribwqtqdhbVar) == null && ikoacuggdjVar2.dxjokdxxww()) {
                            this.f68271zoijcleaow.put(ribwqtqdhbVar, ikoacuggdjVar2);
                        }
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return ikoacuggdjVar2;
            } catch (Exception e13) {
                throw new IllegalStateException("Could not load font", e13);
            }
        }
    }
}
