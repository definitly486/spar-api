package th;

import gg.wwaezpbzkn;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import jh.iyctptxqzt;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import vi.iwizpuwonk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: th.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static class C2714iobyxmoadg extends li.wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk f110494iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ boolean f110495ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Set f110496zoijcleaow;

        /* JADX INFO: renamed from: th.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C2715iobyxmoadg implements tg.draadjrbmk {
            C2715iobyxmoadg() {
            }

            private static /* synthetic */ void iobyxmoadg(int i13) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public wwaezpbzkn invoke(jh.zoijcleaow zoijcleaowVar) {
                if (zoijcleaowVar == null) {
                    iobyxmoadg(0);
                }
                C2714iobyxmoadg.this.f110494iobyxmoadg.iobyxmoadg(zoijcleaowVar);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        C2714iobyxmoadg(iwizpuwonk iwizpuwonkVar, Set set, boolean z13) {
            this.f110494iobyxmoadg = iwizpuwonkVar;
            this.f110496zoijcleaow = set;
            this.f110495ppxfxbqfkf = z13;
        }

        private static /* synthetic */ void gxszxtbevo(int i13) {
            Object[] objArr = new Object[3];
            if (i13 == 1) {
                objArr[0] = "fromSuper";
            } else if (i13 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i13 == 3) {
                objArr[0] = "member";
            } else if (i13 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i13 == 1 || i13 == 2) {
                objArr[2] = "conflict";
            } else if (i13 == 3 || i13 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // li.wflxmlrfwp
        public void eablkybsjg(jh.zoijcleaow zoijcleaowVar, jh.zoijcleaow zoijcleaowVar2) {
            if (zoijcleaowVar == null) {
                gxszxtbevo(1);
            }
            if (zoijcleaowVar2 == null) {
                gxszxtbevo(2);
            }
        }

        @Override // li.agtfadlqog
        public void iobyxmoadg(jh.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar == null) {
                gxszxtbevo(0);
            }
            li.ojitshcjhn.hcddaimhww(zoijcleaowVar, new C2715iobyxmoadg());
            this.f110496zoijcleaow.add(zoijcleaowVar);
        }

        @Override // li.agtfadlqog
        public void wkgbmnqykc(jh.zoijcleaow zoijcleaowVar, Collection collection) {
            if (zoijcleaowVar == null) {
                gxszxtbevo(3);
            }
            if (collection == null) {
                gxszxtbevo(4);
            }
            if (!this.f110495ppxfxbqfkf || zoijcleaowVar.getKind() == jh.zoijcleaow.iobyxmoadg.FAKE_OVERRIDE) {
                super.wkgbmnqykc(zoijcleaowVar, collection);
            }
        }
    }

    public static Collection eablkybsjg(ii.gxszxtbevo gxszxtbevoVar, Collection collection, Collection collection2, jh.eablkybsjg eablkybsjgVar, iwizpuwonk iwizpuwonkVar, li.ojitshcjhn ojitshcjhnVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(6);
        }
        if (collection == null) {
            iobyxmoadg(7);
        }
        if (collection2 == null) {
            iobyxmoadg(8);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(9);
        }
        if (iwizpuwonkVar == null) {
            iobyxmoadg(10);
        }
        if (ojitshcjhnVar == null) {
            iobyxmoadg(11);
        }
        return ppxfxbqfkf(gxszxtbevoVar, collection, collection2, eablkybsjgVar, iwizpuwonkVar, ojitshcjhnVar, true);
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = i13 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 18 ? 3 : 2];
        switch (i13) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = ExternalMetricsManagerImpl.NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i13 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i13) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    private static Collection ppxfxbqfkf(ii.gxszxtbevo gxszxtbevoVar, Collection collection, Collection collection2, jh.eablkybsjg eablkybsjgVar, iwizpuwonk iwizpuwonkVar, li.ojitshcjhn ojitshcjhnVar, boolean z13) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(12);
        }
        if (collection == null) {
            iobyxmoadg(13);
        }
        if (collection2 == null) {
            iobyxmoadg(14);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(15);
        }
        if (iwizpuwonkVar == null) {
            iobyxmoadg(16);
        }
        if (ojitshcjhnVar == null) {
            iobyxmoadg(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ojitshcjhnVar.jyumaefscl(gxszxtbevoVar, collection, collection2, eablkybsjgVar, new C2714iobyxmoadg(iwizpuwonkVar, linkedHashSet, z13));
        return linkedHashSet;
    }

    public static Collection wkgbmnqykc(ii.gxszxtbevo gxszxtbevoVar, Collection collection, Collection collection2, jh.eablkybsjg eablkybsjgVar, iwizpuwonk iwizpuwonkVar, li.ojitshcjhn ojitshcjhnVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(0);
        }
        if (collection == null) {
            iobyxmoadg(1);
        }
        if (collection2 == null) {
            iobyxmoadg(2);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(3);
        }
        if (iwizpuwonkVar == null) {
            iobyxmoadg(4);
        }
        if (ojitshcjhnVar == null) {
            iobyxmoadg(5);
        }
        return ppxfxbqfkf(gxszxtbevoVar, collection, collection2, eablkybsjgVar, iwizpuwonkVar, ojitshcjhnVar, false);
    }

    public static iyctptxqzt zoijcleaow(ii.gxszxtbevo gxszxtbevoVar, jh.eablkybsjg eablkybsjgVar) {
        if (gxszxtbevoVar == null) {
            iobyxmoadg(19);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(20);
        }
        Collection collectionGtknphoqwx = eablkybsjgVar.gtknphoqwx();
        if (collectionGtknphoqwx.size() != 1) {
            return null;
        }
        for (iyctptxqzt iyctptxqztVar : ((jh.wkgbmnqykc) collectionGtknphoqwx.iterator().next()).dxjokdxxww()) {
            if (iyctptxqztVar.getName().equals(gxszxtbevoVar)) {
                return iyctptxqztVar;
            }
        }
        return null;
    }
}
