function compare(one, two){
    console.log(`
    one = ${one} and has a type: ${typeof(one)}
    two = ${two} and has a type: ${typeof(two)}
        one == two returns: ${one == two}
        one === two returns: ${one === two}`)
}

compare(5, '5')
compare(false, 'false')
compare(null, undefined)
compare(null, NaN)
compare(NaN, NaN)
compare({}, {})
compare('', {})
compare({}, [])
compare({}, null)
compare(Infinity, -Infinity)
compare(0, -0)
compare('', [])