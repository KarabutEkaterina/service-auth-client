import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import com.example.AutheticateUserQuery;
import com.example.FindUsersQuery;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApolloClient apolloClient = ApolloClient.builder()
                .serverUrl("https://service-auth.owao.ninja/graphql")
                .build();

        AutheticateUserQuery query = new AutheticateUserQuery("biba", "boba");
        FindUsersQuery query1 = new FindUsersQuery(List.of(1));

        apolloClient.query(query)
                .enqueue(new ApolloCall.Callback<>() {
                    @Override
                    public void onResponse(@NotNull Response<AutheticateUserQuery.Data> response) {
                        System.out.println(response.getData().authenticateUser().jwt());
                    }

                    @Override
                    public void onFailure(@NotNull ApolloException e) {
                        e.printStackTrace();
                    }
                });

        apolloClient.query(query1).enqueue(new ApolloCall.Callback<FindUsersQuery.Data>() {
            @Override
            public void onResponse(@NotNull Response<FindUsersQuery.Data> response) {

            }

            @Override
            public void onFailure(@NotNull ApolloException e) {

            }
        });
    }
}
