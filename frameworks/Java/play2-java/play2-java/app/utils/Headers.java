package utils;

import java.util.concurrent.CompletionStage;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

public class Headers extends Action.Simple {

    @Override
    public CompletionStage<Result> call(Http.Context context) {
//        context.response().setHeader("Foo", "Foo");
        return delegate.call(context);
    }
}
