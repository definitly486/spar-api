package hw0;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import j0.l;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import or0.zoijcleaow;
import p0.tzroggbefp;
import ru.myspar.proloyalty.contacts.api.model.ContactsScreenPayload;
import ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.EditContact;
import ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C0957iobyxmoadg f41244eablkybsjg = new C0957iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f41245gxszxtbevo = 8;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f41246ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.iobyxmoadg f41247wkgbmnqykc;

    /* JADX INFO: renamed from: hw0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0957iobyxmoadg {
        public /* synthetic */ C0957iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0957iobyxmoadg() {
        }
    }

    public iobyxmoadg(lqeggnwhkg storeFactory, ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f41246ppxfxbqfkf = storeFactory;
        this.f41247wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow.wkgbmnqykc(this, this.f41246ppxfxbqfkf, state, null, this.f41247wkgbmnqykc, new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.zoijcleaow(), 2, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        ContactsScreenPayload contactsScreenPayload = (ContactsScreenPayload) gxszxtbevo();
        String name = ((ContactsScreenPayload) gxszxtbevo()).getName();
        tzroggbefp tzroggbefpVar = new tzroggbefp(name == null ? "" : name, 0L, (l) null, 6, (gtknphoqwx) null);
        String phone = ((ContactsScreenPayload) gxszxtbevo()).getPhone();
        if (phone == null) {
            phone = "";
        }
        return new State(contactsScreenPayload, new EditContact(tzroggbefpVar, new tzroggbefp(kcexrzcfyt.y(kcexrzcfyt.jpowsppfya(phone, "+", "", true), 11), 0L, (l) null, 6, (gtknphoqwx) null)), null, false, 12, null);
    }
}
