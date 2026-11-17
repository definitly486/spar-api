package ma1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.personaldata.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f66670zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private final Date zoijcleaow(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        boolean z13 = state.getEmailError() == null && state.getFirstNameError() == null && state.getLastNameError() == null;
        String phone = state.getPhone();
        Date dateZoijcleaow = zoijcleaow(state.getBirthDate());
        String cardNumber = state.getCardNumber();
        lr0.zoijcleaow gender = state.getGender();
        return new nufgyqmvbu(state.getEmail(), state.getEmailError(), state.getIsEmailVerified(), state.getFirstName(), state.getFirstNameError(), state.getLastName(), state.getLastNameError(), dateZoijcleaow, gender, phone, cardNumber, z13, state.getIsSavingDataLoading(), state.getIsLoading());
    }
}
