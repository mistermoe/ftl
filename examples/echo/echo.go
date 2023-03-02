package echo

import (
	"context"
	"fmt"
	"time"

	sdkgo "github.com/TBD54566975/ftl/sdk-go"
)

type EchoRequest struct {
	Name string
}

type EchoResponse struct {
	Message string
}

//ftl:verb
func Echo(ctx context.Context, req EchoRequest) (EchoResponse, error) {
	time, err := sdkgo.Call(ctx, Time, TimeRequest{})
	if err != nil {
		return EchoResponse{}, err
	}
	return EchoResponse{Message: fmt.Sprintf("Hello, %s! It is %s!", req.Name, time.Time)}, nil
}

type TimeRequest struct{}
type TimeResponse struct {
	Time time.Time
}

//ftl:verb
func Time(ctx context.Context, req TimeRequest) (TimeResponse, error) {
	return TimeResponse{Time: time.Now()}, nil
}
