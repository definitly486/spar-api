package jh;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public interface zoijcleaow extends jh.iobyxmoadg, istkbnxepw {

    public enum iobyxmoadg {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean iobyxmoadg() {
            return this != FAKE_OVERRIDE;
        }
    }

    zoijcleaow crxdokpmqz(wflxmlrfwp wflxmlrfwpVar, cdpycssgdh cdpycssgdhVar, yggfygwlhe yggfygwlheVar, iobyxmoadg iobyxmoadgVar, boolean z13);

    @Override // jh.iobyxmoadg
    Collection eablkybsjg();

    iobyxmoadg getKind();

    @Override // jh.iobyxmoadg, jh.wflxmlrfwp
    zoijcleaow iobyxmoadg();

    void skhdrjzrfn(Collection collection);
}
