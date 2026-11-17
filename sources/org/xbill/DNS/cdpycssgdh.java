package org.xbill.DNS;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
public class cdpycssgdh extends yadqdtsiqt {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f74272zoijcleaow;

    private cdpycssgdh(int i13) {
        super(i13);
        if (i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException("Invalid option code, must be one of DAU, DHU, N3U");
        }
        this.f74272zoijcleaow = new ArrayList();
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    String eablkybsjg() {
        Function function;
        int iZoijcleaow = zoijcleaow();
        if (iZoijcleaow == 5) {
            function = new Function() { // from class: org.xbill.DNS.lereixgezr
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return iwizpuwonk.iobyxmoadg(((Integer) obj).intValue());
                }
            };
        } else if (iZoijcleaow == 6) {
            function = new Function() { // from class: org.xbill.DNS.pmvmpeiblj
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cqumvgiudr.iobyxmoadg(((Integer) obj).intValue());
                }
            };
        } else {
            if (iZoijcleaow != 7) {
                throw new IllegalStateException("Unknown option code");
            }
            function = new Function() { // from class: org.xbill.DNS.zynmafqrjb
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return lrnfpwlwnk.iobyxmoadg.iobyxmoadg(((Integer) obj).intValue());
                }
            };
        }
        return "[" + ((String) this.f74272zoijcleaow.stream().map(function).collect(Collectors.joining(", "))) + "]";
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void gxszxtbevo(final jyumaefscl jyumaefsclVar) {
        List list = this.f74272zoijcleaow;
        jyumaefsclVar.getClass();
        list.forEach(new Consumer() { // from class: org.xbill.DNS.istkbnxepw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jyumaefsclVar.draadjrbmk(((Integer) obj).intValue());
            }
        });
    }

    @Override // org.xbill.DNS.yadqdtsiqt
    void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) {
        this.f74272zoijcleaow.clear();
        while (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74272zoijcleaow.add(Integer.valueOf(zdlpuopuiuVar.btonecajqb()));
        }
    }

    public cdpycssgdh(int i13, int... iArr) {
        this(i13);
        if (iArr != null) {
            for (int i14 : iArr) {
                this.f74272zoijcleaow.add(Integer.valueOf(i14));
            }
        }
    }
}
