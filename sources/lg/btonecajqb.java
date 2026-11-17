package lg;

import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public interface btonecajqb {

    public static final class iobyxmoadg {
        /* JADX INFO: Access modifiers changed from: private */
        public static btonecajqb ppxfxbqfkf(btonecajqb acc, zoijcleaow element) {
            eablkybsjg eablkybsjgVar;
            zdlpuopuiu.btonecajqb(acc, "acc");
            zdlpuopuiu.btonecajqb(element, "element");
            btonecajqb btonecajqbVarMinusKey = acc.minusKey(element.getKey());
            gtknphoqwx gtknphoqwxVar = gtknphoqwx.f62507zdlpuopuiu;
            if (btonecajqbVarMinusKey == gtknphoqwxVar) {
                return element;
            }
            lqeggnwhkg.zoijcleaow zoijcleaowVar = lqeggnwhkg.f62508dxjokdxxww;
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) btonecajqbVarMinusKey.get(zoijcleaowVar);
            if (lqeggnwhkgVar == null) {
                eablkybsjgVar = new eablkybsjg(btonecajqbVarMinusKey, element);
            } else {
                btonecajqb btonecajqbVarMinusKey2 = btonecajqbVarMinusKey.minusKey(zoijcleaowVar);
                if (btonecajqbVarMinusKey2 == gtknphoqwxVar) {
                    return new eablkybsjg(element, lqeggnwhkgVar);
                }
                eablkybsjgVar = new eablkybsjg(new eablkybsjg(btonecajqbVarMinusKey2, element), lqeggnwhkgVar);
            }
            return eablkybsjgVar;
        }

        public static btonecajqb zoijcleaow(btonecajqb btonecajqbVar, btonecajqb context) {
            zdlpuopuiu.btonecajqb(context, "context");
            return context == gtknphoqwx.f62507zdlpuopuiu ? btonecajqbVar : (btonecajqb) context.fold(btonecajqbVar, new rgvfuqvkyq() { // from class: lg.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.iobyxmoadg.ppxfxbqfkf((btonecajqb) obj, (btonecajqb.zoijcleaow) obj2);
                }
            });
        }
    }

    public interface ppxfxbqfkf {
    }

    public interface zoijcleaow extends btonecajqb {

        public static final class iobyxmoadg {
            public static Object iobyxmoadg(zoijcleaow zoijcleaowVar, Object obj, rgvfuqvkyq operation) {
                zdlpuopuiu.btonecajqb(operation, "operation");
                return operation.invoke(obj, zoijcleaowVar);
            }

            public static btonecajqb ppxfxbqfkf(zoijcleaow zoijcleaowVar, ppxfxbqfkf key) {
                zdlpuopuiu.btonecajqb(key, "key");
                return zdlpuopuiu.eablkybsjg(zoijcleaowVar.getKey(), key) ? gtknphoqwx.f62507zdlpuopuiu : zoijcleaowVar;
            }

            public static btonecajqb wkgbmnqykc(zoijcleaow zoijcleaowVar, btonecajqb context) {
                zdlpuopuiu.btonecajqb(context, "context");
                return iobyxmoadg.zoijcleaow(zoijcleaowVar, context);
            }

            public static zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, ppxfxbqfkf key) {
                zdlpuopuiu.btonecajqb(key, "key");
                if (!zdlpuopuiu.eablkybsjg(zoijcleaowVar.getKey(), key)) {
                    return null;
                }
                zdlpuopuiu.nufgyqmvbu(zoijcleaowVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return zoijcleaowVar;
            }
        }

        @Override // lg.btonecajqb
        zoijcleaow get(ppxfxbqfkf ppxfxbqfkfVar);

        ppxfxbqfkf getKey();
    }

    Object fold(Object obj, rgvfuqvkyq rgvfuqvkyqVar);

    zoijcleaow get(ppxfxbqfkf ppxfxbqfkfVar);

    btonecajqb minusKey(ppxfxbqfkf ppxfxbqfkfVar);

    btonecajqb plus(btonecajqb btonecajqbVar);
}
