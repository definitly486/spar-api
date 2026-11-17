package c1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class agtfadlqog extends eablkybsjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f18227a = new ArrayList();

    public ArrayList B() {
        return this.f18227a;
    }

    public abstract void C();

    public void D(eablkybsjg eablkybsjgVar) {
        this.f18227a.remove(eablkybsjgVar);
        eablkybsjgVar.nuxfzjnpeb();
    }

    public void E() {
        this.f18227a.clear();
    }

    @Override // c1.eablkybsjg
    public void auzgnhcxok(z0.ppxfxbqfkf ppxfxbqfkfVar) {
        super.auzgnhcxok(ppxfxbqfkfVar);
        int size = this.f18227a.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((eablkybsjg) this.f18227a.get(i13)).auzgnhcxok(ppxfxbqfkfVar);
        }
    }

    public void iobyxmoadg(eablkybsjg eablkybsjgVar) {
        this.f18227a.add(eablkybsjgVar);
        if (eablkybsjgVar.hkdspvbjdz() != null) {
            ((agtfadlqog) eablkybsjgVar.hkdspvbjdz()).D(eablkybsjgVar);
        }
        eablkybsjgVar.m(this);
    }

    @Override // c1.eablkybsjg
    public void nuxfzjnpeb() {
        this.f18227a.clear();
        super.nuxfzjnpeb();
    }
}
