package sh;

import jh.crxdokpmqz;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt implements li.btonecajqb {
    @Override // li.btonecajqb
    public li.btonecajqb.zoijcleaow iobyxmoadg(jh.iobyxmoadg superDescriptor, jh.iobyxmoadg subDescriptor, jh.eablkybsjg eablkybsjgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof crxdokpmqz) || !(superDescriptor instanceof crxdokpmqz)) {
            return li.btonecajqb.zoijcleaow.UNKNOWN;
        }
        crxdokpmqz crxdokpmqzVar = (crxdokpmqz) subDescriptor;
        crxdokpmqz crxdokpmqzVar2 = (crxdokpmqz) superDescriptor;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(crxdokpmqzVar.getName(), crxdokpmqzVar2.getName())) {
            return li.btonecajqb.zoijcleaow.UNKNOWN;
        }
        if (wh.wkgbmnqykc.iobyxmoadg(crxdokpmqzVar) && wh.wkgbmnqykc.iobyxmoadg(crxdokpmqzVar2)) {
            return li.btonecajqb.zoijcleaow.OVERRIDABLE;
        }
        return (wh.wkgbmnqykc.iobyxmoadg(crxdokpmqzVar) || wh.wkgbmnqykc.iobyxmoadg(crxdokpmqzVar2)) ? li.btonecajqb.zoijcleaow.INCOMPATIBLE : li.btonecajqb.zoijcleaow.UNKNOWN;
    }

    @Override // li.btonecajqb
    public li.btonecajqb.iobyxmoadg zoijcleaow() {
        return li.btonecajqb.iobyxmoadg.BOTH;
    }
}
