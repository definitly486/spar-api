package fi;

import di.ojitshcjhn;
import di.rgvfuqvkyq;
import gg.iwizpuwonk;
import hg.jyumaefscl;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f33906iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f33907zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f33908iobyxmoadg;

        static {
            int[] iArr = new int[ojitshcjhn.ppxfxbqfkf.EnumC0569ppxfxbqfkf.values().length];
            try {
                iArr[ojitshcjhn.ppxfxbqfkf.EnumC0569ppxfxbqfkf.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ojitshcjhn.ppxfxbqfkf.EnumC0569ppxfxbqfkf.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ojitshcjhn.ppxfxbqfkf.EnumC0569ppxfxbqfkf.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33908iobyxmoadg = iArr;
        }
    }

    public wkgbmnqykc(rgvfuqvkyq strings, ojitshcjhn qualifiedNames) {
        zdlpuopuiu.btonecajqb(strings, "strings");
        zdlpuopuiu.btonecajqb(qualifiedNames, "qualifiedNames");
        this.f33906iobyxmoadg = strings;
        this.f33907zoijcleaow = qualifiedNames;
    }

    private final iwizpuwonk ppxfxbqfkf(int i13) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z13 = false;
        while (i13 != -1) {
            ojitshcjhn.ppxfxbqfkf ppxfxbqfkfVarCqumvgiudr = this.f33907zoijcleaow.cqumvgiudr(i13);
            String strCqumvgiudr = this.f33906iobyxmoadg.cqumvgiudr(ppxfxbqfkfVarCqumvgiudr.istkbnxepw());
            ojitshcjhn.ppxfxbqfkf.EnumC0569ppxfxbqfkf enumC0569ppxfxbqfkfPmvmpeiblj = ppxfxbqfkfVarCqumvgiudr.pmvmpeiblj();
            zdlpuopuiu.lqeggnwhkg(enumC0569ppxfxbqfkfPmvmpeiblj);
            int i14 = iobyxmoadg.f33908iobyxmoadg[enumC0569ppxfxbqfkfPmvmpeiblj.ordinal()];
            if (i14 == 1) {
                linkedList2.addFirst(strCqumvgiudr);
            } else if (i14 == 2) {
                linkedList.addFirst(strCqumvgiudr);
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(strCqumvgiudr);
                z13 = true;
            }
            i13 = ppxfxbqfkfVarCqumvgiudr.zynmafqrjb();
        }
        return new iwizpuwonk(linkedList, linkedList2, Boolean.valueOf(z13));
    }

    @Override // fi.ppxfxbqfkf
    public String getString(int i13) {
        String strCqumvgiudr = this.f33906iobyxmoadg.cqumvgiudr(i13);
        zdlpuopuiu.dxjokdxxww(strCqumvgiudr, "getString(...)");
        return strCqumvgiudr;
    }

    @Override // fi.ppxfxbqfkf
    public boolean iobyxmoadg(int i13) {
        return ((Boolean) ppxfxbqfkf(i13).btonecajqb()).booleanValue();
    }

    @Override // fi.ppxfxbqfkf
    public String zoijcleaow(int i13) {
        iwizpuwonk iwizpuwonkVarPpxfxbqfkf = ppxfxbqfkf(i13);
        List list = (List) iwizpuwonkVarPpxfxbqfkf.iobyxmoadg();
        String strIwxlajgraz = jyumaefscl.iwxlajgraz((List) iwizpuwonkVarPpxfxbqfkf.wkgbmnqykc(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strIwxlajgraz;
        }
        return jyumaefscl.iwxlajgraz(list, CardDateFormatTextWatcher.DIVIDER_CHARACTER, null, null, 0, null, null, 62, null) + '/' + strIwxlajgraz;
    }
}
