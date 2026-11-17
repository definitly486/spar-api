package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC3420bo;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f48899a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedList f48900a;

        /* synthetic */ Builder(int i13) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC3420bo> userProfileUpdate) {
            this.f48900a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f48900a, 0);
        }

        private Builder() {
            this.f48900a = new LinkedList();
        }
    }

    /* synthetic */ UserProfile(LinkedList linkedList, int i13) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC3420bo>> getUserProfileUpdates() {
        return this.f48899a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f48899a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
