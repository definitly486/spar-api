package kx;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import j0.l;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p0.tzroggbefp;
import ru.myspar.contacts.api.model.ContactsScreenPayload;
import ru.myspar.contacts.impl.contacts_screen.domain.store.EditContact;
import ru.myspar.contacts.impl.contacts_screen.domain.store.State;
import vs.zoijcleaow;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ru.myspar.contacts.impl.contacts_screen.domain.store.iobyxmoadg f60792ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f60793zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final C1222iobyxmoadg f60791wkgbmnqykc = new C1222iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f60790eablkybsjg = 8;

    /* JADX INFO: renamed from: kx.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1222iobyxmoadg {
        public /* synthetic */ C1222iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1222iobyxmoadg() {
        }
    }

    public iobyxmoadg(lqeggnwhkg storeFactory, ru.myspar.contacts.impl.contacts_screen.domain.store.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f60793zoijcleaow = storeFactory;
        this.f60792ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        ContactsScreenPayload contactsScreenPayload = (ContactsScreenPayload) gxszxtbevo();
        String name = ((ContactsScreenPayload) gxszxtbevo()).getName();
        tzroggbefp tzroggbefpVar = new tzroggbefp(name == null ? "" : name, 0L, (l) null, 6, (gtknphoqwx) null);
        String phone = ((ContactsScreenPayload) gxszxtbevo()).getPhone();
        if (phone == null) {
            phone = "";
        }
        return new State(contactsScreenPayload, new EditContact(tzroggbefpVar, new tzroggbefp(kcexrzcfyt.y(kcexrzcfyt.jpowsppfya(phone, "+", "", true), 11), 0L, (l) null, 6, (gtknphoqwx) null)), null, false, 12, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow.wkgbmnqykc(this, this.f60793zoijcleaow, state, null, this.f60792ppxfxbqfkf, new ru.myspar.contacts.impl.contacts_screen.domain.store.zoijcleaow(), 2, null);
    }
}
