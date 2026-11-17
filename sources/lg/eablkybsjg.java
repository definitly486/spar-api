package lg;

import gg.wwaezpbzkn;
import java.io.Serializable;
import kotlin.jvm.internal.hcddaimhww;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg implements btonecajqb, Serializable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final btonecajqb.zoijcleaow f62503yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final btonecajqb f62504zdlpuopuiu;

    private static final class iobyxmoadg implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final C1267iobyxmoadg f62505yggfygwlhe = new C1267iobyxmoadg(null);

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final btonecajqb[] f62506zdlpuopuiu;

        /* JADX INFO: renamed from: lg.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1267iobyxmoadg {
            public /* synthetic */ C1267iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private C1267iobyxmoadg() {
            }
        }

        public iobyxmoadg(btonecajqb[] elements) {
            zdlpuopuiu.btonecajqb(elements, "elements");
            this.f62506zdlpuopuiu = elements;
        }

        private final Object readResolve() {
            btonecajqb[] btonecajqbVarArr = this.f62506zdlpuopuiu;
            btonecajqb btonecajqbVarPlus = gtknphoqwx.f62507zdlpuopuiu;
            for (btonecajqb btonecajqbVar : btonecajqbVarArr) {
                btonecajqbVarPlus = btonecajqbVarPlus.plus(btonecajqbVar);
            }
            return btonecajqbVarPlus;
        }
    }

    public eablkybsjg(btonecajqb left, btonecajqb.zoijcleaow element) {
        zdlpuopuiu.btonecajqb(left, "left");
        zdlpuopuiu.btonecajqb(element, "element");
        this.f62504zdlpuopuiu = left;
        this.f62503yggfygwlhe = element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cdpycssgdh(String acc, btonecajqb.zoijcleaow element) {
        zdlpuopuiu.btonecajqb(acc, "acc");
        zdlpuopuiu.btonecajqb(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final Object writeReplace() {
        int iZynmafqrjb = zynmafqrjb();
        final btonecajqb[] btonecajqbVarArr = new btonecajqb[iZynmafqrjb];
        final hcddaimhww hcddaimhwwVar = new hcddaimhww();
        fold(wwaezpbzkn.f37140iobyxmoadg, new rgvfuqvkyq() { // from class: lg.ppxfxbqfkf
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.yadqdtsiqt(btonecajqbVarArr, hcddaimhwwVar, (wwaezpbzkn) obj, (btonecajqb.zoijcleaow) obj2);
            }
        });
        if (hcddaimhwwVar.f60014zdlpuopuiu == iZynmafqrjb) {
            return new iobyxmoadg(btonecajqbVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(btonecajqb[] btonecajqbVarArr, hcddaimhww hcddaimhwwVar, wwaezpbzkn wwaezpbzknVar, btonecajqb.zoijcleaow element) {
        zdlpuopuiu.btonecajqb(wwaezpbzknVar, "<unused var>");
        zdlpuopuiu.btonecajqb(element, "element");
        int i13 = hcddaimhwwVar.f60014zdlpuopuiu;
        hcddaimhwwVar.f60014zdlpuopuiu = i13 + 1;
        btonecajqbVarArr[i13] = element;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean yggfygwlhe(eablkybsjg eablkybsjgVar) {
        while (zdlpuopuiu(eablkybsjgVar.f62503yggfygwlhe)) {
            btonecajqb btonecajqbVar = eablkybsjgVar.f62504zdlpuopuiu;
            if (!(btonecajqbVar instanceof eablkybsjg)) {
                zdlpuopuiu.nufgyqmvbu(btonecajqbVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return zdlpuopuiu((btonecajqb.zoijcleaow) btonecajqbVar);
            }
            eablkybsjgVar = (eablkybsjg) btonecajqbVar;
        }
        return false;
    }

    private final boolean zdlpuopuiu(btonecajqb.zoijcleaow zoijcleaowVar) {
        return zdlpuopuiu.eablkybsjg(get(zoijcleaowVar.getKey()), zoijcleaowVar);
    }

    private final int zynmafqrjb() {
        int i13 = 2;
        eablkybsjg eablkybsjgVar = this;
        while (true) {
            btonecajqb btonecajqbVar = eablkybsjgVar.f62504zdlpuopuiu;
            eablkybsjgVar = btonecajqbVar instanceof eablkybsjg ? (eablkybsjg) btonecajqbVar : null;
            if (eablkybsjgVar == null) {
                return i13;
            }
            i13++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eablkybsjg) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
                if (eablkybsjgVar.zynmafqrjb() != zynmafqrjb() || !eablkybsjgVar.yggfygwlhe(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, rgvfuqvkyq operation) {
        zdlpuopuiu.btonecajqb(operation, "operation");
        return operation.invoke(this.f62504zdlpuopuiu.fold(obj, operation), this.f62503yggfygwlhe);
    }

    @Override // lg.btonecajqb
    public btonecajqb.zoijcleaow get(btonecajqb.ppxfxbqfkf key) {
        zdlpuopuiu.btonecajqb(key, "key");
        eablkybsjg eablkybsjgVar = this;
        while (true) {
            btonecajqb.zoijcleaow zoijcleaowVar = eablkybsjgVar.f62503yggfygwlhe.get(key);
            if (zoijcleaowVar != null) {
                return zoijcleaowVar;
            }
            btonecajqb btonecajqbVar = eablkybsjgVar.f62504zdlpuopuiu;
            if (!(btonecajqbVar instanceof eablkybsjg)) {
                return btonecajqbVar.get(key);
            }
            eablkybsjgVar = (eablkybsjg) btonecajqbVar;
        }
    }

    public int hashCode() {
        return this.f62504zdlpuopuiu.hashCode() + this.f62503yggfygwlhe.hashCode();
    }

    @Override // lg.btonecajqb
    public btonecajqb minusKey(btonecajqb.ppxfxbqfkf key) {
        zdlpuopuiu.btonecajqb(key, "key");
        if (this.f62503yggfygwlhe.get(key) != null) {
            return this.f62504zdlpuopuiu;
        }
        btonecajqb btonecajqbVarMinusKey = this.f62504zdlpuopuiu.minusKey(key);
        if (btonecajqbVarMinusKey == this.f62504zdlpuopuiu) {
            return this;
        }
        return btonecajqbVarMinusKey == gtknphoqwx.f62507zdlpuopuiu ? this.f62503yggfygwlhe : new eablkybsjg(btonecajqbVarMinusKey, this.f62503yggfygwlhe);
    }

    @Override // lg.btonecajqb
    public btonecajqb plus(btonecajqb btonecajqbVar) {
        return btonecajqb.iobyxmoadg.zoijcleaow(this, btonecajqbVar);
    }

    public String toString() {
        return '[' + ((String) fold("", new rgvfuqvkyq() { // from class: lg.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.cdpycssgdh((String) obj, (btonecajqb.zoijcleaow) obj2);
            }
        })) + ']';
    }
}
