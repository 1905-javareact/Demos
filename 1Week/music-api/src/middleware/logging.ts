


export function loggingMiddleware(req, res, next){
    console.log(`request url is: ${req.url} and request method is: ${req.method}`)
    next();
}