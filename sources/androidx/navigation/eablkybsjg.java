package androidx.navigation;

import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ntlheqmsrt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg extends ntlheqmsrt implements h5.gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f12078iobyxmoadg = new LinkedHashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final zoijcleaow f12077zoijcleaow = new zoijcleaow(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final crxdokpmqz.ppxfxbqfkf f12076ppxfxbqfkf = new iobyxmoadg();

    public static final class iobyxmoadg implements crxdokpmqz.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            return new eablkybsjg();
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final eablkybsjg iobyxmoadg(jlmebxxoox viewModelStore) {
            zdlpuopuiu.btonecajqb(viewModelStore, "viewModelStore");
            return (eablkybsjg) new crxdokpmqz(viewModelStore, eablkybsjg.f12076ppxfxbqfkf, null, 4, null).zoijcleaow(eablkybsjg.class);
        }

        private zoijcleaow() {
        }
    }

    public final void draadjrbmk(String backStackEntryId) {
        zdlpuopuiu.btonecajqb(backStackEntryId, "backStackEntryId");
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) this.f12078iobyxmoadg.remove(backStackEntryId);
        if (jlmebxxooxVar != null) {
            jlmebxxooxVar.iobyxmoadg();
        }
    }

    @Override // h5.gtknphoqwx
    public jlmebxxoox lqeggnwhkg(String backStackEntryId) {
        zdlpuopuiu.btonecajqb(backStackEntryId, "backStackEntryId");
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) this.f12078iobyxmoadg.get(backStackEntryId);
        if (jlmebxxooxVar != null) {
            return jlmebxxooxVar;
        }
        jlmebxxoox jlmebxxooxVar2 = new jlmebxxoox();
        this.f12078iobyxmoadg.put(backStackEntryId, jlmebxxooxVar2);
        return jlmebxxooxVar2;
    }

    @Override // androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        Iterator it = this.f12078iobyxmoadg.values().iterator();
        while (it.hasNext()) {
            ((jlmebxxoox) it.next()).iobyxmoadg();
        }
        this.f12078iobyxmoadg.clear();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("NavControllerViewModel{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("} ViewModelStores (");
        Iterator it = this.f12078iobyxmoadg.keySet().iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(')');
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
        return string;
    }
}
