
{
}

let blank = ['\t' ' ' ]//변환됨
rule isverb = parse

 | blank+  { isverb lexbuf }
 | ("is"|"am"|"are") as verb{
    Printf.printf "%s is verb.\n" verb; isverb lexbuf }
 | ['a'-'z' 'A'-'Z']+ as word{
    Printf.printf "%s is not verb.\n" word; isverb lexbuf }
 | _                 { isverb lexbuf }
{
  let main() =
  let chnl = open_in Sys.argv.(1) in
  let lexbuf = Lexing.from_channel chnl in
  isverb lexbuf

  let _ = Printexc.print main()
}
