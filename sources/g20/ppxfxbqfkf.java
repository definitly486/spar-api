package g20;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.CommentReferences;
import ru.myspar.core.domain.models.reference.Reference;
import w10.nufgyqmvbu;
import w10.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nufgyqmvbu f35855ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f35856zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35857iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f35857iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35857iobyxmoadg, ((iobyxmoadg) obj).f35857iobyxmoadg);
        }

        public int hashCode() {
            return this.f35857iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35857iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f35857iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f35858cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f35860jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f35861yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35862zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35860jyumaefscl = obj;
            this.f35858cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(wkgbmnqykc cartRemoteSource, nufgyqmvbu orderLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f35856zoijcleaow = cartRemoteSource;
        this.f35855ppxfxbqfkf = orderLocalSource;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    private final List eablkybsjg(List list, List list2) {
        Reference referencePpxfxbqfkf;
        String str;
        Object next;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    str = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!zdlpuopuiu.eablkybsjg(((Reference) next).getCode(), reference.getCode()));
                Reference reference2 = (Reference) next;
                if (reference2 != null) {
                    boolean checked = reference2.getChecked();
                    String text = reference2.getText();
                    if (reference.lqeggnwhkg() && reference2.lqeggnwhkg()) {
                        str = text;
                    }
                    referencePpxfxbqfkf = Reference.ppxfxbqfkf(reference, null, null, null, null, checked, str == null ? reference.getText() : str, null, 79, null);
                    if (referencePpxfxbqfkf == null) {
                        referencePpxfxbqfkf = Reference.ppxfxbqfkf(reference, null, null, null, null, false, "", null, 79, null);
                    }
                } else {
                    referencePpxfxbqfkf = Reference.ppxfxbqfkf(reference, null, null, null, null, false, "", null, 79, null);
                }
            } else {
                referencePpxfxbqfkf = Reference.ppxfxbqfkf(reference, null, null, null, null, false, "", null, 79, null);
            }
            arrayList.add(referencePpxfxbqfkf);
        }
        return arrayList;
    }

    private final List wkgbmnqykc(List list, List list2) {
        Object next;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CommentReferences commentReferencesPpxfxbqfkf = (CommentReferences) it.next();
            if (!list2.isEmpty()) {
                List items = commentReferencesPpxfxbqfkf.getItems();
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!zdlpuopuiu.eablkybsjg(((CommentReferences) next).getCode(), commentReferencesPpxfxbqfkf.getCode()));
                CommentReferences commentReferences = (CommentReferences) next;
                commentReferencesPpxfxbqfkf = CommentReferences.ppxfxbqfkf(commentReferencesPpxfxbqfkf, null, null, eablkybsjg(items, commentReferences != null ? commentReferences.getItems() : null), 3, null);
            }
            arrayList.add(commentReferencesPpxfxbqfkf);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        ppxfxbqfkf ppxfxbqfkfVar2;
        List list;
        e10.iobyxmoadg iobyxmoadgVar2;
        List listWflxmlrfwp;
        e10.nufgyqmvbu nufgyqmvbuVarAgtfadlqog;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f35858cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f35858cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objDxjokdxxww = zoijcleaowVar.f35860jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f35858cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f35861yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f35862zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) zoijcleaowVar.f35861yggfygwlhe;
                ppxfxbqfkfVar2 = (ppxfxbqfkf) zoijcleaowVar.f35862zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            }
            iobyxmoadgVar2 = (e10.iobyxmoadg) objDxjokdxxww;
            if (iobyxmoadgVar2 != null || (nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar2.agtfadlqog()) == null || (listWflxmlrfwp = nufgyqmvbuVarAgtfadlqog.eablkybsjg()) == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            return ppxfxbqfkfVar2.wkgbmnqykc(list, listWflxmlrfwp);
        }
        gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        wkgbmnqykc wkgbmnqykcVar = this.f35856zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f35862zdlpuopuiu = this;
        zoijcleaowVar.f35861yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f35858cqumvgiudr = 1;
        objDxjokdxxww = wkgbmnqykcVar.dxjokdxxww(strIobyxmoadg, zoijcleaowVar);
        if (objDxjokdxxww == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        List list2 = (List) objDxjokdxxww;
        nufgyqmvbu nufgyqmvbuVar = ppxfxbqfkfVar.f35855ppxfxbqfkf;
        String strIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f35862zdlpuopuiu = ppxfxbqfkfVar;
        zoijcleaowVar.f35861yggfygwlhe = list2;
        zoijcleaowVar.f35858cqumvgiudr = 2;
        Object objWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc(strIobyxmoadg2, zoijcleaowVar);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        objDxjokdxxww = objWkgbmnqykc;
        list = list2;
        iobyxmoadgVar2 = (e10.iobyxmoadg) objDxjokdxxww;
        if (iobyxmoadgVar2 != null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        } else {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return ppxfxbqfkfVar2.wkgbmnqykc(list, listWflxmlrfwp);
    }
}
